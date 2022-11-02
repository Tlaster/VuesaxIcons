package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Bookmark2: ImageVector
    get() {
        if (_bookmark2 != null) {
            return _bookmark2!!
        }
        _bookmark2 = Builder(name = "Bookmark2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                curveTo(16.0f, 2.0f, 17.0f, 3.01f, 17.0f, 5.03f)
                verticalLineTo(12.08f)
                curveTo(17.0f, 14.07f, 15.59f, 14.84f, 13.86f, 13.8f)
                lineTo(12.54f, 13.0f)
                curveTo(12.24f, 12.82f, 11.76f, 12.82f, 11.46f, 13.0f)
                lineTo(10.14f, 13.8f)
                curveTo(8.41f, 14.84f, 7.0f, 14.07f, 7.0f, 12.08f)
                verticalLineTo(5.03f)
                curveTo(7.0f, 3.01f, 8.0f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 14.93f)
                curveTo(2.0f, 19.98f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 19.98f, 22.0f, 14.93f)
                verticalLineTo(11.9f)
                curveTo(22.0f, 7.59f, 20.54f, 5.48f, 17.0f, 4.96f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8191f, 4.99f)
                curveTo(3.9791f, 5.46f, 2.5291f, 7.0f, 2.1191f, 9.94f)
            }
        }
        .build()
        return _bookmark2!!
    }

private var _bookmark2: ImageVector? = null
