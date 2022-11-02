package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Group9: ImageVector
    get() {
        if (_group9 != null) {
            return _group9!!
        }
        _group9 = Builder(name = "Group9", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9f, 2.0f)
                horizontalLineTo(9.1f)
                curveTo(8.42f, 2.0f, 7.46f, 2.4f, 6.98f, 2.88f)
                lineTo(2.88f, 6.98f)
                curveTo(2.4f, 7.46f, 2.0f, 8.42f, 2.0f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2.0f, 15.58f, 2.4f, 16.54f, 2.88f, 17.02f)
                lineTo(6.98f, 21.12f)
                curveTo(7.46f, 21.6f, 8.42f, 22.0f, 9.1f, 22.0f)
                horizontalLineTo(14.9f)
                curveTo(15.58f, 22.0f, 16.54f, 21.6f, 17.02f, 21.12f)
                lineTo(21.12f, 17.02f)
                curveTo(21.6f, 16.54f, 22.0f, 15.58f, 22.0f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(22.0f, 8.42f, 21.6f, 7.46f, 21.12f, 6.98f)
                lineTo(17.02f, 2.88f)
                curveTo(16.54f, 2.4f, 15.58f, 2.0f, 14.9f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 15.5f)
                lineTo(15.5f, 8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 15.5f)
                lineTo(8.5f, 8.5f)
            }
        }
        .build()
        return _group9!!
    }

private var _group9: ImageVector? = null
