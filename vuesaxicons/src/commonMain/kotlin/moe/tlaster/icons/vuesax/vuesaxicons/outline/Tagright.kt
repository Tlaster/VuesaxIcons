package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Tagright: ImageVector
    get() {
        if (_tagright != null) {
            return _tagright!!
        }
        _tagright = Builder(name = "Tagright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6694f, 21.6501f)
                horizontalLineTo(4.2194f)
                curveTo(3.1194f, 21.6501f, 2.1495f, 21.0801f, 1.6194f, 20.1201f)
                curveTo(1.0895f, 19.1601f, 1.1195f, 18.0301f, 1.6995f, 17.1001f)
                lineTo(4.4694f, 12.6701f)
                curveTo(4.6894f, 12.3201f, 4.6894f, 11.6701f, 4.4694f, 11.3301f)
                lineTo(1.6995f, 6.9001f)
                curveTo(1.1195f, 5.9701f, 1.0895f, 4.8401f, 1.6194f, 3.8801f)
                curveTo(2.1495f, 2.9201f, 3.1294f, 2.3501f, 4.2194f, 2.3501f)
                horizontalLineTo(15.6594f)
                curveTo(16.5994f, 2.3501f, 17.6894f, 2.9501f, 18.1794f, 3.7501f)
                lineTo(22.3594f, 10.4301f)
                curveTo(22.9194f, 11.3301f, 22.8694f, 12.7101f, 22.2294f, 13.5601f)
                lineTo(17.0494f, 20.4601f)
                curveTo(16.5394f, 21.1401f, 15.5194f, 21.6501f, 14.6694f, 21.6501f)
                close()
                moveTo(4.2194f, 3.8501f)
                curveTo(3.6794f, 3.8501f, 3.1895f, 4.1301f, 2.9295f, 4.6101f)
                curveTo(2.6695f, 5.0901f, 2.6794f, 5.6501f, 2.9694f, 6.1101f)
                lineTo(5.7394f, 10.5401f)
                curveTo(6.2594f, 11.3801f, 6.2594f, 12.6401f, 5.7394f, 13.4801f)
                lineTo(2.9694f, 17.9101f)
                curveTo(2.6794f, 18.3701f, 2.6695f, 18.9301f, 2.9295f, 19.4101f)
                curveTo(3.1895f, 19.8901f, 3.6794f, 20.1701f, 4.2194f, 20.1701f)
                horizontalLineTo(14.6694f)
                curveTo(15.0494f, 20.1701f, 15.6194f, 19.8801f, 15.8494f, 19.5801f)
                lineTo(21.0295f, 12.6801f)
                curveTo(21.2995f, 12.3201f, 21.3295f, 11.6301f, 21.0895f, 11.2501f)
                lineTo(16.9094f, 4.5701f)
                curveTo(16.6894f, 4.2101f, 16.0794f, 3.8801f, 15.6594f, 3.8801f)
                horizontalLineTo(4.2194f)
                verticalLineTo(3.8501f)
                close()
            }
        }
        .build()
        return _tagright!!
    }

private var _tagright: ImageVector? = null
