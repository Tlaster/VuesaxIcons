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

public val BoldGroup.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = Builder(name = "Previous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2409f, 7.2196f)
                verticalLineTo(16.7896f)
                curveTo(20.2409f, 18.7496f, 18.1109f, 19.9796f, 16.4109f, 18.9996f)
                lineTo(12.2609f, 16.6096f)
                lineTo(8.1109f, 14.2096f)
                curveTo(6.4109f, 13.2296f, 6.4109f, 10.7796f, 8.1109f, 9.7996f)
                lineTo(12.2609f, 7.3996f)
                lineTo(16.4109f, 5.0096f)
                curveTo(18.1109f, 4.0296f, 20.2409f, 5.2496f, 20.2409f, 7.2196f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7617f, 18.9303f)
                curveTo(3.3517f, 18.9303f, 3.0117f, 18.5903f, 3.0117f, 18.1803f)
                verticalLineTo(5.8203f)
                curveTo(3.0117f, 5.4103f, 3.3517f, 5.0703f, 3.7617f, 5.0703f)
                curveTo(4.1717f, 5.0703f, 4.5117f, 5.4103f, 4.5117f, 5.8203f)
                verticalLineTo(18.1803f)
                curveTo(4.5117f, 18.5903f, 4.1717f, 18.9303f, 3.7617f, 18.9303f)
                close()
            }
        }
        .build()
        return _previous!!
    }

private var _previous: ImageVector? = null
