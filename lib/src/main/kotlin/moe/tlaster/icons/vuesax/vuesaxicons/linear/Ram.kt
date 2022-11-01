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

public val LinearGroup.Ram: ImageVector
    get() {
        if (_ram != null) {
            return _ram!!
        }
        _ram = Builder(name = "Ram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.5f, 20.0f, 4.97f, 22.0f, 8.5f, 22.0f)
                horizontalLineTo(15.5f)
                curveTo(18.97f, 22.0f, 20.5f, 20.0f, 20.5f, 17.0f)
                verticalLineTo(15.83f)
                curveTo(20.5f, 15.3f, 20.29f, 14.79f, 19.91f, 14.42f)
                lineTo(19.08f, 13.59f)
                curveTo(18.7f, 13.21f, 18.49f, 12.71f, 18.49f, 12.18f)
                verticalLineTo(10.0f)
                curveTo(18.49f, 9.45f, 18.94f, 9.0f, 19.49f, 9.0f)
                curveTo(20.04f, 9.0f, 20.49f, 8.55f, 20.49f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(20.49f, 4.0f, 18.96f, 2.0f, 15.49f, 2.0f)
                horizontalLineTo(8.49f)
                curveTo(4.97f, 2.0f, 3.5f, 4.0f, 3.5f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.99f, 21.97f)
                lineTo(7.98f, 19.0f)
                curveTo(7.98f, 17.89f, 8.87f, 17.0f, 9.98f, 17.0f)
                horizontalLineTo(13.99f)
                curveTo(15.09f, 17.0f, 15.98f, 17.89f, 15.99f, 18.99f)
                lineTo(16.02f, 21.98f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.97f, 7.78f)
                horizontalLineTo(7.97f)
            }
        }
        .build()
        return _ram!!
    }

private var _ram: ImageVector? = null
