package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.75f)
                horizontalLineTo(10.0f)
                curveTo(4.57f, 22.75f, 2.25f, 20.43f, 2.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.25f, 3.57f, 4.57f, 1.25f, 10.0f, 1.25f)
                horizontalLineTo(14.0f)
                curveTo(19.43f, 1.25f, 21.75f, 3.57f, 21.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(21.75f, 20.43f, 19.43f, 22.75f, 14.0f, 22.75f)
                close()
                moveTo(10.0f, 2.75f)
                curveTo(5.39f, 2.75f, 3.75f, 4.39f, 3.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.75f, 19.61f, 5.39f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(18.61f, 21.25f, 20.25f, 19.61f, 20.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(20.25f, 4.39f, 18.61f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0696f, 12.5401f)
                curveTo(14.8896f, 12.5401f, 14.7096f, 12.4701f, 14.5696f, 12.3501f)
                curveTo(13.1096f, 11.0501f, 10.8896f, 11.0501f, 9.4296f, 12.3501f)
                curveTo(9.2696f, 12.5001f, 9.0496f, 12.5601f, 8.8196f, 12.5301f)
                curveTo(8.5996f, 12.5001f, 8.4096f, 12.3701f, 8.2896f, 12.1801f)
                lineTo(6.1096f, 8.6801f)
                curveTo(5.9196f, 8.3701f, 5.9796f, 7.9701f, 6.2496f, 7.7201f)
                curveTo(9.5296f, 4.8101f, 14.4696f, 4.8101f, 17.7496f, 7.7201f)
                curveTo(18.0196f, 7.9601f, 18.0796f, 8.3701f, 17.8896f, 8.6801f)
                lineTo(15.7096f, 12.1801f)
                curveTo(15.5896f, 12.3701f, 15.3996f, 12.4901f, 15.1796f, 12.5301f)
                curveTo(15.1396f, 12.5301f, 15.0996f, 12.5401f, 15.0696f, 12.5401f)
                close()
                moveTo(11.9996f, 9.8701f)
                curveTo(12.9996f, 9.8701f, 13.9896f, 10.1501f, 14.8596f, 10.7001f)
                lineTo(16.2596f, 8.4501f)
                curveTo(13.7296f, 6.5701f, 10.2596f, 6.5701f, 7.7296f, 8.4501f)
                lineTo(9.1296f, 10.7001f)
                curveTo(10.0096f, 10.1401f, 10.9996f, 9.8701f, 11.9996f, 9.8701f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
