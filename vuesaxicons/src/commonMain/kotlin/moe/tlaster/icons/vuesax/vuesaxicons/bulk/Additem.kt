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

public val BulkGroup.Additem: ImageVector
    get() {
        if (_additem != null) {
            return _additem!!
        }
        _additem = Builder(name = "Additem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5703f, 22.0f)
                horizontalLineTo(14.0003f)
                curveTo(11.7103f, 22.0f, 10.5703f, 20.86f, 10.5703f, 18.57f)
                verticalLineTo(11.43f)
                curveTo(10.5703f, 9.14f, 11.7103f, 8.0f, 14.0003f, 8.0f)
                horizontalLineTo(18.5703f)
                curveTo(20.8603f, 8.0f, 22.0003f, 9.14f, 22.0003f, 11.43f)
                verticalLineTo(18.57f)
                curveTo(22.0003f, 20.86f, 20.8603f, 22.0f, 18.5703f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.43f, 5.43f)
                verticalLineTo(6.77f)
                curveTo(10.81f, 6.98f, 9.32f, 8.66f, 9.32f, 11.43f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.43f)
                curveTo(3.14f, 16.0f, 2.0f, 14.86f, 2.0f, 12.57f)
                verticalLineTo(5.43f)
                curveTo(2.0f, 3.14f, 3.14f, 2.0f, 5.43f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(12.29f, 2.0f, 13.43f, 3.14f, 13.43f, 5.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1291f, 14.2501f)
                horizontalLineTo(17.2491f)
                verticalLineTo(13.3701f)
                curveTo(17.2491f, 12.9601f, 16.9091f, 12.6201f, 16.4991f, 12.6201f)
                curveTo(16.0891f, 12.6201f, 15.7491f, 12.9601f, 15.7491f, 13.3701f)
                verticalLineTo(14.2501f)
                horizontalLineTo(14.8691f)
                curveTo(14.4591f, 14.2501f, 14.1191f, 14.5901f, 14.1191f, 15.0001f)
                curveTo(14.1191f, 15.4101f, 14.4591f, 15.7501f, 14.8691f, 15.7501f)
                horizontalLineTo(15.7491f)
                verticalLineTo(16.6301f)
                curveTo(15.7491f, 17.0401f, 16.0891f, 17.3801f, 16.4991f, 17.3801f)
                curveTo(16.9091f, 17.3801f, 17.2491f, 17.0401f, 17.2491f, 16.6301f)
                verticalLineTo(15.7501f)
                horizontalLineTo(18.1291f)
                curveTo(18.5391f, 15.7501f, 18.8791f, 15.4101f, 18.8791f, 15.0001f)
                curveTo(18.8791f, 14.5901f, 18.5391f, 14.2501f, 18.1291f, 14.2501f)
                close()
            }
        }
        .build()
        return _additem!!
    }

private var _additem: ImageVector? = null
