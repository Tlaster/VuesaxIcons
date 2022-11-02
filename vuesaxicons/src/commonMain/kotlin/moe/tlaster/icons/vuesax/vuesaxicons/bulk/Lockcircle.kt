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

public val BulkGroup.Lockcircle: ImageVector
    get() {
        if (_lockcircle != null) {
            return _lockcircle!!
        }
        _lockcircle = Builder(name = "Lockcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7491f, 10.73f)
                verticalLineTo(10.0f)
                curveTo(15.7491f, 9.07f, 15.7491f, 6.25f, 11.9991f, 6.25f)
                curveTo(8.2492f, 6.25f, 8.2492f, 9.07f, 8.2492f, 10.0f)
                verticalLineTo(10.73f)
                curveTo(7.0292f, 11.0f, 6.6191f, 11.79f, 6.6191f, 13.5f)
                verticalLineTo(14.5f)
                curveTo(6.6191f, 16.7f, 7.2991f, 17.38f, 9.4992f, 17.38f)
                horizontalLineTo(14.4991f)
                curveTo(16.6991f, 17.38f, 17.3792f, 16.7f, 17.3792f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(17.3792f, 11.79f, 16.9691f, 11.0f, 15.7491f, 10.73f)
                close()
                moveTo(11.9991f, 15.1f)
                curveTo(11.3891f, 15.1f, 10.8992f, 14.61f, 10.8992f, 14.0f)
                curveTo(10.8992f, 13.39f, 11.3891f, 12.9f, 11.9991f, 12.9f)
                curveTo(12.6091f, 12.9f, 13.0991f, 13.39f, 13.0991f, 14.0f)
                curveTo(13.0991f, 14.61f, 12.6091f, 15.1f, 11.9991f, 15.1f)
                close()
                moveTo(14.2491f, 10.62f)
                horizontalLineTo(9.7492f)
                verticalLineTo(10.0f)
                curveTo(9.7492f, 8.54f, 10.1091f, 7.75f, 11.9991f, 7.75f)
                curveTo(13.8891f, 7.75f, 14.2491f, 8.54f, 14.2491f, 10.0f)
                verticalLineTo(10.62f)
                close()
            }
        }
        .build()
        return _lockcircle!!
    }

private var _lockcircle: ImageVector? = null
