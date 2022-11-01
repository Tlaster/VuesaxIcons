package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9595f, 11.6608f)
                curveTo(20.7695f, 10.9108f, 19.3895f, 10.5008f, 17.9695f, 10.5008f)
                curveTo(13.8295f, 10.5008f, 10.4695f, 13.8608f, 10.4695f, 18.0008f)
                curveTo(10.4695f, 19.4208f, 10.8695f, 20.7908f, 11.6195f, 21.9808f)
                curveTo(11.1595f, 21.9708f, 10.6895f, 21.9208f, 10.2095f, 21.8508f)
                curveTo(6.0995f, 21.1508f, 2.7895f, 17.8208f, 2.1095f, 13.7008f)
                curveTo(0.9795f, 6.8507f, 6.8195f, 1.0108f, 13.6695f, 2.1407f)
                curveTo(17.7895f, 2.8207f, 21.1195f, 6.1308f, 21.8195f, 10.2408f)
                curveTo(21.8995f, 10.7208f, 21.9495f, 11.2008f, 21.9595f, 11.6608f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3807f, 21.86f)
                curveTo(12.5007f, 20.82f, 11.9707f, 19.47f, 11.9707f, 18.0f)
                curveTo(11.9707f, 14.69f, 14.6607f, 12.0f, 17.9707f, 12.0f)
                curveTo(19.4407f, 12.0f, 20.7907f, 12.53f, 21.8307f, 13.41f)
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
