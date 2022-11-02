package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Hex: ImageVector
    get() {
        if (_hex != null) {
            return _hex!!
        }
        _hex = Builder(name = "Hex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.3001f)
                horizontalLineTo(7.0f)
                lineTo(2.0f, 12.0f)
                lineTo(7.0f, 20.7001f)
                horizontalLineTo(17.0f)
                lineTo(22.0f, 12.0f)
                lineTo(17.0f, 3.3001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9001f, 14.0f)
                horizontalLineTo(7.0001f)
                lineTo(5.1001f, 17.3f)
                lineTo(7.0001f, 20.7f)
                horizontalLineTo(10.9001f)
                lineTo(12.8001f, 17.3f)
                lineTo(10.9001f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.2999f, 8.0f)
                horizontalLineTo(6.9999f)
                lineTo(3.3999f, 14.3f)
                lineTo(6.9999f, 20.7f)
                horizontalLineTo(14.2999f)
                lineTo(17.9999f, 14.3f)
                lineTo(14.2999f, 8.0f)
                close()
            }
        }
        .build()
        return _hex!!
    }

private var _hex: ImageVector? = null
