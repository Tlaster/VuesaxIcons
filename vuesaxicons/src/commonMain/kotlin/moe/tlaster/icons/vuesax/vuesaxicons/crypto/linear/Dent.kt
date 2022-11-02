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

public val LinearGroup.Dent: ImageVector
    get() {
        if (_dent != null) {
            return _dent!!
        }
        _dent = Builder(name = "Dent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0999f)
                curveTo(11.3f, 18.0999f, 10.7f, 17.4999f, 10.7f, 16.7999f)
                verticalLineTo(7.1999f)
                curveTo(10.7f, 6.4999f, 11.3f, 5.8999f, 12.0f, 5.8999f)
                curveTo(12.7f, 5.8999f, 13.3f, 6.4999f, 13.3f, 7.1999f)
                verticalLineTo(16.8999f)
                curveTo(13.3f, 17.5999f, 12.7f, 18.0999f, 12.0f, 18.0999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7f, 8.9f)
                curveTo(7.0f, 8.3f, 7.8f, 8.1f, 8.5f, 8.4f)
                lineTo(16.9f, 13.2f)
                curveTo(17.5f, 13.6f, 17.7f, 14.4f, 17.4f, 15.0f)
                curveTo(17.0f, 15.6f, 16.2f, 15.8f, 15.6f, 15.5f)
                lineTo(7.2f, 10.7f)
                curveTo(6.5f, 10.4f, 6.3f, 9.6f, 6.7f, 8.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7f, 15.1f)
                curveTo(6.3f, 14.5f, 6.5999f, 13.7f, 7.2f, 13.3f)
                lineTo(15.6f, 8.5f)
                curveTo(16.2f, 8.1f, 17.0f, 8.4f, 17.4f, 9.0f)
                curveTo(17.8f, 9.6f, 17.5f, 10.4f, 16.9f, 10.8f)
                lineTo(8.5f, 15.6f)
                curveTo(7.8f, 15.9f, 6.9999f, 15.7f, 6.7f, 15.1f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _dent!!
    }

private var _dent: ImageVector? = null
