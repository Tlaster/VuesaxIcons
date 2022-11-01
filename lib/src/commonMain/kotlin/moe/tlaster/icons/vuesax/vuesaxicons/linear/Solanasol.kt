package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Solanasol: ImageVector
    get() {
        if (_solanasol != null) {
            return _solanasol!!
        }
        _solanasol = Builder(name = "Solanasol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0002f, 3.5f)
                horizontalLineTo(5.5002f)
                curveTo(5.2002f, 3.5f, 4.9002f, 3.6f, 4.7002f, 3.9f)
                lineTo(3.2002f, 5.9f)
                curveTo(2.7002f, 6.6f, 3.2002f, 7.5f, 4.0002f, 7.5f)
                horizontalLineTo(18.5002f)
                curveTo(18.8002f, 7.5f, 19.1002f, 7.4f, 19.3002f, 7.1f)
                lineTo(20.8002f, 5.1f)
                curveTo(21.3002f, 4.4f, 20.8002f, 3.5f, 20.0002f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0002f, 10.0f)
                horizontalLineTo(18.5002f)
                curveTo(18.8002f, 10.0f, 19.1002f, 10.1f, 19.3002f, 10.4f)
                lineTo(20.8002f, 12.4f)
                curveTo(21.3002f, 13.1f, 20.8002f, 14.0f, 20.0002f, 14.0f)
                horizontalLineTo(5.5002f)
                curveTo(5.2002f, 14.0f, 4.9002f, 13.9f, 4.7002f, 13.6f)
                lineTo(3.2002f, 11.6f)
                curveTo(2.7002f, 10.9f, 3.2002f, 10.0f, 4.0002f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0002f, 16.5f)
                horizontalLineTo(5.5002f)
                curveTo(5.2002f, 16.5f, 4.9002f, 16.6f, 4.7002f, 16.9f)
                lineTo(3.2002f, 18.9f)
                curveTo(2.7002f, 19.6f, 3.2002f, 20.5f, 4.0002f, 20.5f)
                horizontalLineTo(18.5002f)
                curveTo(18.8002f, 20.5f, 19.1002f, 20.4f, 19.3002f, 20.1f)
                lineTo(20.8002f, 18.1f)
                curveTo(21.3002f, 17.4f, 20.8002f, 16.5f, 20.0002f, 16.5f)
                close()
            }
        }
        .build()
        return _solanasol!!
    }

private var _solanasol: ImageVector? = null
