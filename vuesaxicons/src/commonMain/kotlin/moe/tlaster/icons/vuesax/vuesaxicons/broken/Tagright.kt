package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Tagright: ImageVector
    get() {
        if (_tagright != null) {
            return _tagright!!
        }
        _tagright = Builder(name = "Tagright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.2195f, 3.1001f)
                curveTo(2.4695f, 3.1001f, 1.4095f, 5.0201f, 2.3295f, 6.5101f)
                lineTo(5.0995f, 10.9401f)
                curveTo(5.4695f, 11.5301f, 5.4695f, 12.4901f, 5.0995f, 13.0801f)
                lineTo(2.3295f, 17.5101f)
                curveTo(1.3995f, 18.9901f, 2.4695f, 20.9201f, 4.2195f, 20.9201f)
                horizontalLineTo(14.6695f)
                curveTo(15.2795f, 20.9201f, 16.0795f, 20.5201f, 16.4495f, 20.0301f)
                lineTo(21.6295f, 13.1301f)
                curveTo(22.0895f, 12.5201f, 22.1295f, 11.4901f, 21.7295f, 10.8501f)
                lineTo(17.5495f, 4.1701f)
                curveTo(17.1895f, 3.5901f, 16.3395f, 3.1201f, 15.6595f, 3.1201f)
                horizontalLineTo(8.6595f)
            }
        }
        .build()
        return _tagright!!
    }

private var _tagright: ImageVector? = null
