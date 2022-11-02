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

public val LinearGroup.Sunfog: ImageVector
    get() {
        if (_sunfog != null) {
            return _sunfog!!
        }
        _sunfog = Builder(name = "Sunfog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                curveTo(18.5f, 8.41f, 15.59f, 5.5f, 12.0f, 5.5f)
                curveTo(8.41f, 5.5f, 5.5f, 8.41f, 5.5f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.99f, 4.99f)
                lineTo(4.86f, 4.86f)
                moveTo(19.01f, 4.99f)
                lineTo(19.14f, 4.86f)
                lineTo(19.01f, 4.99f)
                close()
                moveTo(12.0f, 2.08f)
                verticalLineTo(2.0f)
                verticalLineTo(2.08f)
                close()
                moveTo(2.08f, 12.0f)
                horizontalLineTo(2.0f)
                horizontalLineTo(2.08f)
                close()
                moveTo(22.0f, 12.0f)
                horizontalLineTo(21.92f)
                horizontalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                horizontalLineTo(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                horizontalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _sunfog!!
    }

private var _sunfog: ImageVector? = null
