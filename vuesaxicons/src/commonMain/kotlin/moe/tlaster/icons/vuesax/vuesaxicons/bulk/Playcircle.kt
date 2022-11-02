package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Playcircle: ImageVector
    get() {
        if (_playcircle != null) {
            return _playcircle!!
        }
        _playcircle = Builder(name = "Playcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 22.0f)
                curveTo(17.4936f, 22.0f, 21.9707f, 17.5228f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.4771f, 17.4936f, 2.0f, 11.9707f, 2.0f)
                curveTo(6.4479f, 2.0f, 1.9707f, 6.4771f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.5228f, 6.4479f, 22.0f, 11.9707f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9694f, 10.2301f)
                lineTo(12.0694f, 8.5601f)
                curveTo(11.3494f, 8.1401f, 10.4794f, 8.1401f, 9.7594f, 8.5601f)
                curveTo(9.0394f, 8.9801f, 8.6094f, 9.7201f, 8.6094f, 10.5601f)
                verticalLineTo(13.9101f)
                curveTo(8.6094f, 14.7401f, 9.0394f, 15.4901f, 9.7594f, 15.9101f)
                curveTo(10.1194f, 16.1201f, 10.5194f, 16.2201f, 10.9094f, 16.2201f)
                curveTo(11.3094f, 16.2201f, 11.6994f, 16.1201f, 12.0594f, 15.9101f)
                lineTo(14.9594f, 14.2401f)
                curveTo(15.6794f, 13.8201f, 16.1094f, 13.0801f, 16.1094f, 12.2401f)
                curveTo(16.1294f, 11.4001f, 15.6994f, 10.6501f, 14.9694f, 10.2301f)
                close()
            }
        }
        .build()
        return _playcircle!!
    }

private var _playcircle: ImageVector? = null
