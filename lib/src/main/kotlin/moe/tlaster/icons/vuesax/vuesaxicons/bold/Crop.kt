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

public val BoldGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.53f, 2.0f)
                curveTo(5.11f, 2.0f, 4.78f, 2.34f, 4.78f, 2.75f)
                verticalLineTo(4.78f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 4.78f, 2.0f, 5.11f, 2.0f, 5.53f)
                curveTo(2.0f, 5.95f, 2.34f, 6.28f, 2.75f, 6.28f)
                horizontalLineTo(5.53f)
                curveTo(5.94f, 6.28f, 6.28f, 5.94f, 6.28f, 5.53f)
                verticalLineTo(2.75f)
                curveTo(6.28f, 2.34f, 5.94f, 2.0f, 5.53f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2507f, 17.7188f)
                horizontalLineTo(18.4707f)
                curveTo(18.0607f, 17.7188f, 17.7207f, 18.0588f, 17.7207f, 18.4688f)
                verticalLineTo(21.2488f)
                curveTo(17.7207f, 21.6588f, 18.0607f, 21.9988f, 18.4707f, 21.9988f)
                curveTo(18.8807f, 21.9988f, 19.2207f, 21.6588f, 19.2207f, 21.2488f)
                verticalLineTo(19.2188f)
                horizontalLineTo(21.2507f)
                curveTo(21.6607f, 19.2188f, 22.0007f, 18.8787f, 22.0007f, 18.4688f)
                curveTo(22.0007f, 18.0588f, 21.6607f, 17.7188f, 21.2507f, 17.7188f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7201f, 18.4703f)
                curveTo(16.7201f, 17.5103f, 17.5101f, 16.7203f, 18.4701f, 16.7203f)
                horizontalLineTo(19.1601f)
                verticalLineTo(10.0503f)
                curveTo(19.1601f, 7.1603f, 16.8201f, 4.8203f, 13.9301f, 4.8203f)
                horizontalLineTo(7.2801f)
                verticalLineTo(5.5103f)
                curveTo(7.2801f, 6.4703f, 6.4901f, 7.2603f, 5.5301f, 7.2603f)
                horizontalLineTo(4.8301f)
                verticalLineTo(13.9303f)
                curveTo(4.8301f, 16.8203f, 7.1701f, 19.1603f, 10.0601f, 19.1603f)
                horizontalLineTo(16.7301f)
                verticalLineTo(18.4703f)
                horizontalLineTo(16.7201f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
