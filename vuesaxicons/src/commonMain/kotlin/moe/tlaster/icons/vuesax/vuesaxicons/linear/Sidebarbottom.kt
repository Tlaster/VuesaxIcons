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

public val LinearGroup.Sidebarbottom: ImageVector
    get() {
        if (_sidebarbottom != null) {
            return _sidebarbottom!!
        }
        _sidebarbottom = Builder(name = "Sidebarbottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.97f, 4.0f, 19.97f, 2.0f, 14.97f, 2.0f)
                horizontalLineTo(8.97f)
                curveTo(3.97f, 2.0f, 1.97f, 4.0f, 1.97f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.97f, 20.0f, 3.97f, 22.0f, 8.97f, 22.0f)
                horizontalLineTo(14.97f)
                curveTo(19.97f, 22.0f, 21.97f, 20.0f, 21.97f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.5f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.56f, 8.5f)
                lineTo(12.0f, 11.06f)
                lineTo(9.44f, 8.5f)
            }
        }
        .build()
        return _sidebarbottom!!
    }

private var _sidebarbottom: ImageVector? = null
