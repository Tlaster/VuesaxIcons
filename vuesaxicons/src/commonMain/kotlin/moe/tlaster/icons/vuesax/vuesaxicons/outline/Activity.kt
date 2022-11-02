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

public val OutlineGroup.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3301f, 15.24f)
                curveTo(7.1701f, 15.24f, 7.0101f, 15.19f, 6.8701f, 15.08f)
                curveTo(6.5401f, 14.83f, 6.4801f, 14.36f, 6.7301f, 14.03f)
                lineTo(9.1101f, 10.94f)
                curveTo(9.4001f, 10.57f, 9.8101f, 10.33f, 10.2801f, 10.27f)
                curveTo(10.7401f, 10.21f, 11.2101f, 10.34f, 11.5801f, 10.63f)
                lineTo(13.4101f, 12.07f)
                curveTo(13.4801f, 12.13f, 13.5501f, 12.13f, 13.6001f, 12.12f)
                curveTo(13.6401f, 12.12f, 13.7101f, 12.1f, 13.7701f, 12.02f)
                lineTo(16.0801f, 9.04f)
                curveTo(16.3301f, 8.71f, 16.8101f, 8.65f, 17.1301f, 8.91f)
                curveTo(17.4601f, 9.16f, 17.5201f, 9.63f, 17.2601f, 9.96f)
                lineTo(14.9501f, 12.94f)
                curveTo(14.6601f, 13.31f, 14.2501f, 13.55f, 13.7801f, 13.6f)
                curveTo(13.3101f, 13.66f, 12.8501f, 13.53f, 12.4801f, 13.24f)
                lineTo(10.6501f, 11.8f)
                curveTo(10.5801f, 11.74f, 10.5001f, 11.74f, 10.4601f, 11.75f)
                curveTo(10.4201f, 11.75f, 10.3501f, 11.77f, 10.2901f, 11.85f)
                lineTo(7.9101f, 14.94f)
                curveTo(7.7801f, 15.14f, 7.5601f, 15.24f, 7.3301f, 15.24f)
                close()
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
