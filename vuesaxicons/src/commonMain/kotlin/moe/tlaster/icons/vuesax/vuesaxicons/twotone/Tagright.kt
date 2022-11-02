package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Tagright: ImageVector
    get() {
        if (_tagright != null) {
            return _tagright!!
        }
        _tagright = Builder(name = "Tagright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.2192f, 3.1001f)
                horizontalLineTo(15.6592f)
                curveTo(16.3392f, 3.1001f, 17.1892f, 3.5701f, 17.5492f, 4.1501f)
                lineTo(21.7292f, 10.8301f)
                curveTo(22.1292f, 11.4801f, 22.0892f, 12.5001f, 21.6292f, 13.1101f)
                lineTo(16.4492f, 20.0101f)
                curveTo(16.0792f, 20.5001f, 15.2792f, 20.9001f, 14.6692f, 20.9001f)
                horizontalLineTo(4.2192f)
                curveTo(2.4692f, 20.9001f, 1.4092f, 18.9801f, 2.3292f, 17.4901f)
                lineTo(5.0992f, 13.0601f)
                curveTo(5.4692f, 12.4701f, 5.4692f, 11.5101f, 5.0992f, 10.9201f)
                lineTo(2.3292f, 6.4901f)
                curveTo(1.4092f, 5.0201f, 2.4792f, 3.1001f, 4.2192f, 3.1001f)
                close()
            }
        }
        .build()
        return _tagright!!
    }

private var _tagright: ImageVector? = null
