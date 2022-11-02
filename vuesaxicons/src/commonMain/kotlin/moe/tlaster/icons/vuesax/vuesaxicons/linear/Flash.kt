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

public val LinearGroup.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = Builder(name = "Flash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.3199f, 13.28f)
                horizontalLineTo(12.4099f)
                verticalLineTo(20.48f)
                curveTo(12.4099f, 21.54f, 13.7299f, 22.04f, 14.4299f, 21.24f)
                lineTo(21.9999f, 12.64f)
                curveTo(22.6599f, 11.89f, 22.1299f, 10.72f, 21.1299f, 10.72f)
                horizontalLineTo(18.0399f)
                verticalLineTo(3.52f)
                curveTo(18.0399f, 2.46f, 16.7199f, 1.96f, 16.0199f, 2.76f)
                lineTo(8.4499f, 11.36f)
                curveTo(7.7999f, 12.11f, 8.3299f, 13.28f, 9.3199f, 13.28f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 4.0f)
                horizontalLineTo(1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 20.0f)
                horizontalLineTo(1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 12.0f)
                horizontalLineTo(1.5f)
            }
        }
        .build()
        return _flash!!
    }

private var _flash: ImageVector? = null
